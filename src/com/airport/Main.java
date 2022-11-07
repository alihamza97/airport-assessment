package com.airport;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.airport.dto.AirportsDTO;
import com.airport.dto.RunwayDTO;
import com.airport.model.Airports;
import com.airport.model.Countries;
import com.airport.model.Runway;
import com.airport.report.AirportReport;
import com.opencsv.CSVReader;

public class Main {

	public static void main(String[] args) {

		AirportReport airportReport = new AirportReport();

//		airportReport.getCountriesDetails("resources/countries.csv");

//		 airportReport.getAirportDetails("resources/airports.csv");

//		 airportReport.getRunWayList("resources/runways.csv");

//		/// Runways
//		List<Countries> countriesList = airportReport.getCountriesDetails("resources/countries.csv");
//
//		countriesList.stream().forEach(System.out::println);
//
//		/// Airports
//		List<Airports> airportsList = airportReport.getAirportDetails("resources/airports.csv");
//
//		airportsList.stream().forEach(System.out::println);
//
		/// Runways
		List<Runway> runwayList = airportReport.getRunwayList("resources/runways.csv");
//
//		runwayList.stream().forEach(System.out::println);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the country code");
		String countryCode = sc.next().toUpperCase();

		System.out.println("******************** Runways List**********************************");
		List<RunwayDTO> airportsList = airportReport.findRunwayByCountryCode(countryCode, "resources/runways.csv",
				"resources/airports.csv");
		airportsList.stream().forEach(System.out::println);

		System.out.println("Top 10 countries with the highest number of airports");
		List<AirportsDTO> countriesWithHigherNrAirports = airportReport
				.countriesWithHeighestNumberOfAirports("resources/airports.csv", "resources/countries.csv", runwayList);
		countriesWithHigherNrAirports.stream().forEach(System.out::println);


	}

}
