package com.airport;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.airport.dto.RunwayDTO;
import com.airport.model.Runway;
import com.airport.report.AirportReport;

public class Main {

	public static void main(String[] args) {

		AirportReport airportReport = new AirportReport();
//
		/// Runways
		List<Runway> runwayList = airportReport.getRunwayList("resources/runways.csv");
//
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the country code");
		String countryCode = sc.next().toUpperCase();

		System.out.println("******************** Runways List**********************************");
		List<RunwayDTO> airportsList = airportReport.findRunwayByCountryCode(countryCode, "resources/runways.csv",
				"resources/airports.csv");
		airportsList.stream().forEach(System.out::println);

		System.out.println("\n************Top 10 countries with the highest number of airports**********");
		Map<String, Long> airportMap = airportReport.getCountriesWithNumberAirports("resources/airports.csv",
				"resources/countries.csv", runwayList);

		// LinkedHashMap to preserve the ordering of elements
		LinkedHashMap<String, Long> linkedListAirports = new LinkedHashMap<>();

		airportMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEachOrdered(x -> linkedListAirports.put(x.getKey(), x.getValue()));

		int counter = 0;
		for (Entry<String, Long> m : linkedListAirports.entrySet()) {
			counter++;
			System.out.println(m.getKey());
			if (counter >= 10) {
				break;
			}
		}

	}

}
