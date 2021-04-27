apiclient= (function () {
            var url = "http://localhost:8080/ipadress"
            //var url = "https://arep-proyecto.herokuapp.com/ipadress"
            var  getIpdates = function(city,callback){
                $.getJSON(url+"/"+city+".",(data)=>{
                    callback(data);
                },null)
            };
            var  getFunctionsByWeather = function(a,b,c,callback){
               $.getJSON(url+"/"+a+"/"+b+"/"+c,(data)=>{
                   callback(data);
               },null)
            };
            return {
                getIpdates:getIpdates,
                getFunctionsByWeather:getFunctionsByWeather,
            }
 })();