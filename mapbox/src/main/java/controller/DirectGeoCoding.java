package controller;

import java.io.IOException;
import java.util.List;

import com.mapbox.api.geocoding.v5.GeocodingCriteria;
import com.mapbox.api.geocoding.v5.MapboxGeocoding;
import com.mapbox.api.geocoding.v5.models.CarmenFeature;
import com.mapbox.api.geocoding.v5.models.GeocodingResponse;

public class DirectGeoCoding {

	public static void main(String[] args) throws IOException {
		
		
		MapboxGeocoding mapboxGeocoding = MapboxGeocoding.builder()
				.accessToken("pk.eyJ1IjoiNXVld2VveGg2eHRjdGtraSIsImEiOiJja2hsdHh4amIxdWZ6MnlvOXV5YmRpYWZuIn0.zdkWsaHuiBTut6DzPwt3wA")
				.country("il")
				.query("19 David Remez St Ashkelon")
				.build();
		

		
		
		
		GeocodingResponse response = mapboxGeocoding.executeCall().body();
		

		List<CarmenFeature> results = response.features();
		System.out.println(results.size());
		
		
//		System.out.println(response.features().get(0).context().get(2));
		System.out.println(response.features().toString());
		
		
	}

}
