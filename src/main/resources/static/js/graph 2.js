  var ctx = document.getElementById("myChart").getContext("2d");
    var myChart = new Chart(ctx, {
        type: "pie",
        data: {
            labels: ['AWS', 'Azure', 'Otros'],
            datasets: [{
                label: 'Num datos',
                data: [2, 1, 5],
                backgroundColor: [
                    'rgb(142, 15, 226, 0.904)',
                    'rgb(218, 19, 19, 0.904)',
                    'rgb(19, 22, 218, 0.692)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            }
        }
    });

    var grafica2 = document.getElementById("myChart2").getContext("2d");
    var myChart = new Chart(grafica2, {
        type: "bar",
        data: {
            labels: ['AWS', 'Azure', 'Otros'],
            datasets: [{
                label: 'Num datos',
                data: [2, 1, 5],
                backgroundColor: [
                    'rgb(142, 15, 226, 0.904)',
                    'rgb(218, 19, 19, 0.904)',
                    'rgb(19, 22, 218, 0.692)'
                ],
                borderWidth: 2
            }]
        },
        options: {
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            }
        }
    });
    var grafica3 = document.getElementById("myChart3").getContext("2d");
    var myChart = new Chart(grafica3, {
        type: "polarArea",
        data: {
            labels: ['United States', 'Colombia', 'Otros'],
            datasets: [{
                label: 'Num datos',
                data: [7, 1, 0],
                backgroundColor: [
                    'rgb(142, 15, 226, 0.904)',
                    'rgb(218, 19, 19, 0.904)',
                    'rgb(19, 22, 218, 0.692)'
                ],
                borderWidth: 2

            }]
        },
        options: {
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            }
        }
    });
    