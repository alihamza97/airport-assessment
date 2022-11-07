package com.airport.report;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.airport.dto.AirportsDTO;
import com.airport.dto.RunwayDTO;
import com.airport.model.Airports;
import com.airport.model.Countries;
import com.airport.model.Runway;

public class AirportReport {

	public List<Runway> getRunwayList(String filePath) {
		List<Runway> runwayList = new ArrayList<>();
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				String id = data[0];
				String airportRef = data[1];
				String airportIdent = data[2];
				String lengthFt = data[3];
				String widthFt = data[4];
				String surface = data[5];
				String lighted = data[6];
				String closed = data[7];

				Runway runway = new Runway(id, airportRef, airportIdent, lengthFt, widthFt, surface, lighted, closed);
				runwayList.add(runway);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return runwayList;
	}

	public List<Countries> getCountriesDetails(String filePath, List<Airports> airportsList) {
		List<Countries> countriesList = new ArrayList<>();
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				String countryId = data[0];
				String countryCode = data[1];
				String countryName = data[2];
				String continent = data[3];
				Countries countries = new Countries(countryId, countryCode, countryName, continent, airportsList);
				countriesList.add(countries);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return countriesList;
	}

	public List<Airports> getAirportDetails(String filePath, List<Runway> runwayList) {

		List<Airports> airportsList = new ArrayList<>();
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				String id = data[0];
				String ident = data[1];
				String type = data[2];
				String name = data[3];
				String latitudeDeg = data[4];
				String longitudeDeg = data[5];
				String elevationFt = data[6];
				String continent = data[7];
				String country = data[8];
				String isoRegion = data[9];
				String municipality = data[10];
				String scheduledService = data[11];
				Airports airport = new Airports(id, ident, type, name, latitudeDeg, longitudeDeg, elevationFt,
						continent, country, isoRegion, municipality, scheduledService, runwayList);
				airportsList.add(airport);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return airportsList;
	}

	public List<RunwayDTO> findRunwayByCountryCode(String countryCode, String runwayFile, String airportFile) {
		List<RunwayDTO> filteredRunway = new ArrayList<>();
		List<Runway> runwayDataList = getRunwayList(runwayFile);

		List<Airports> browseList = getAirportDetails(airportFile, runwayDataList);
		for (Airports a : browseList) {
			if (countryCode.equals(a.getCountry())) {
				for (Runway r : runwayDataList) {
					if (a.getId().equals(r.getAirportRef())) {
						filteredRunway.add(new RunwayDTO(a.getId(), r.getAirportRef(), r.getAirportIdent(),
								r.getLengthFt(), r.getWidthFt(), r.getSurface(), a.getCountry(), a.getName()));
					}
				}
			}
		}

		return filteredRunway;

	}

	public List<AirportsDTO> countriesWithHeighestNumberOfAirports(String airportFile, String countriesFile,
			List<Runway> runwayList) {
		int counter = 0;
		List<AirportsDTO> fileteredAirports = new ArrayList<>();
		List<Airports> airportsList = getAirportDetails(airportFile, runwayList);
		List<Countries> countriesList = getCountriesDetails(countriesFile, airportsList);
		for (Countries c : countriesList) {
			for (Airports a : airportsList) {
				if (c.getCode().equals(a.getCountry())) {

					fileteredAirports.add(new AirportsDTO(c.getName(), a.getName(), counter));

				}
			}
		}

		return fileteredAirports;
	}

	public Map<String, Long> getCountriesWithNumberAirports(String airportFile, String countriesFile,
			List<Runway> runwayList) {
		List<AirportsDTO> fileteredAirports = countriesWithHeighestNumberOfAirports(airportFile, countriesFile,
				runwayList);
		Map<String, Long> airportMap = fileteredAirports.stream()
				.collect(Collectors.groupingBy(x -> x.getCountryName(), Collectors.counting()));

		return airportMap;
	}

}
