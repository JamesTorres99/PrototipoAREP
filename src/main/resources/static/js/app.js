document.addEventListener('DOMContentLoaded', function () {
    if (document.querySelectorAll('#map-canvas').length > 0)
    {
        if (document.querySelector('html').lang)
            lang = document.querySelector('html').lang;
        else
            lang = 'en';

        var js_file = document.createElement('script');
        js_file.type = 'text/javascript';
        js_file.src = 'https://maps.googleapis.com/maps/api/js?&signed_in=true&language=' + lang;
        document.getElementsByTagName('head')[0].appendChild(js_file);
    }
});
var api = apiclient;
var app = (function (){
	var city;
    var markers;
    var bounds;
    var map;
	var _map = function (list){
    	return list.map(function(data){
    			return {name:data.name, temp:data.main.city, pressure: data.main.isp_name}
    	})
    }
	var setCity = function(city_name){
		city = city_name;
	};
	function table(ipadress) {
	    console.log(ipadress)
	    console.log(ipadress.main.city);
	    console.log(ipadress.main.region);
	    console.log(ipadress.main.country);
	    console.log(ipadress.main.organization_name);
	    console.log(ipadress.main.isp_name);
	    console.log(ipadress.main.feels_like);
	    $("#body").html("");
    		$('#body')
    			.append(
    			  `<tr>
    				<td>`+ipadress.main.city+`</td>
    				<td>`+ipadress.main.region+`</td>
    				<td>`+ipadress.main.country+`</td>
    				<td>`+ipadress.main.organization_name+`</td>
    				<td>`+ipadress.main.isp_name+`</td>
    			  </tr>`
    			);
    	plotMarkers(ipadress);
    };
	var getIpdates = function(city) {
        setCity(city);
        if (city != "") {
            api.getIpdates(city,table);
        }
    };
	var getFunctionsByWeather =  function (b,c) {
        console.log(b);
        if (a != "" && b != "" ) {
            api.getFunctionsByWeather(a,b,c,getSeats);
        }
    };
    function initMap(){
        clearMap();
        map = new google.maps.Map(document.getElementById('map-canvas'), {
            center: {lat: -34.397, lng: 150.644},
            zoom: 8
        });
    };
    function clearMap(){
        if (markers){
            markers.forEach(function (marker) {
                marker.setMap(null);
            });
        }
    }
    function plotMarkers(m) {
        markers = [];
        bounds = new google.maps.LatLngBounds();
        console.log(m);
         var position = new google.maps.LatLng(m.coord.lat, m.coord.lon);
         markers.push(
            new google.maps.Marker({
                     position: position,
                     map: map,
                     animation: google.maps.Animation.DROP
                 })
         );
        bounds.extend(position);
        map.fitBounds(bounds);
    }
	return {
	    getFunctionsByWeather : getFunctionsByWeather,
		getIpdates :  getIpdates,
        initMap:initMap,
        plotMarkers:plotMarkers,
	};
})();