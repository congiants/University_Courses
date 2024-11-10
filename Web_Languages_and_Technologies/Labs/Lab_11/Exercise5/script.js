document.addEventListener("DOMContentLoaded",

    function (event){
        function randomNumber(){
            document.getElementById("greens").innerHTML = "Greens: "; 
            document.getElementById("reds").innerHTML = "Reds: "; 
            var display = document.getElementById("timer");
            display.innerHTML = "Time: "

            document.getElementById("startButton").disabled = true;
            var table = document.getElementById("numberTable");
            for(var i =0; i < table.rows.length; i++){
                for(var j =0; j < table.rows[i].cells.length; j++){
                    var currentCell = table.rows[i].cells[j];
                    currentCell.innerHTML = Math.round(Math.random()*10);
                    currentCell.addEventListener("click", changeColor);
                }
            }
            var display = document.getElementById("timer");
            secondsTimer(10, display);
        }

        function secondsTimer(seconds, display){
            var originalDisplay = display.innerHTML;
            var myInterval = setInterval(function () {
                display.innerHTML = originalDisplay + seconds;
                seconds = seconds-1;
                if(seconds === -1){
                    clearInterval(myInterval);

                    var greens = 0;
                    var reds = 0;
                    var table = document.getElementById("numberTable");
                    for(var i =0; i < table.rows.length; i++){
                        for(var j =0; j < table.rows[i].cells.length; j++){
                            var currentCell = table.rows[i].cells[j];
                            currentCell.style.backgroundColor == 'green' ? greens++ :reds++;
                        }
                    }
                    document.getElementById("greens").innerHTML = "Greens: " + greens; 
                    document.getElementById("reds").innerHTML = "Reds: " + reds; 
                    document.getElementById("startButton").disabled = false;

                }
            }, 1000);        
        }
        
        function changeColor(){
           parseInt(this.innerHTML) > 5 ? this.style.backgroundColor = 'green' : this.style.backgroundColor = 'red';
        }

        document.getElementById("startButton").addEventListener("click", randomNumber);
    }
);