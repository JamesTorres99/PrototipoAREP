apiclient= (function () {
            //var url = "http://localhost:8080/weather"
            var url = "https://arep-proyecto.herokuapp.com/ipadress"
            var  getWeatherByCity = function(city,callback){
                $.getJSON(url+"/"+city,(data)=>{
                    callback(data);
                },null)
            };
            var  getFunctionsByWeather = function(a,b,c,callback){
               $.getJSON(url+"/"+a+"/"+b+"/"+c,(data)=>{
                   callback(data);
               },null)
            };
            return {
                getWeatherByCity:getWeatherByCity,
                getFunctionsByWeather:getFunctionsByWeather,
            }
 })();