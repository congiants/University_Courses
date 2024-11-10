document.addEventListener("DOMContentLoaded",

    function (event){


        function randomNumber(){
            document.clicks =0;
            document.sum = 0;
            document.getElementById("startButton").disabled = true;
            document.getElementById("avgNumber").innerHTML = "Average number: ";
            var table = document.getElementById("numberTable");
            for(var i =0; i < table.rows.length; i++){
                for(var j =0; j < table.rows[i].cells.length; j++){
                    var currentCell = table.rows[i].cells[j];
                    currentCell.innerHTML = Math.round(Math.random()*10);
                    var colorRandomizer =Math.random()
                    colorRandomizer > 0.5 ? currentCell.style.backgroundColor = 'green' : currentCell.style.backgroundColor = 'red'
                    currentCell.addEventListener("click", decreaseNumber);
                }
            }
        }

        function decreaseNumber(){
            document.clicks ++;
            document.sum = document.sum + parseInt(this.innerHTML);
            if(this.style.backgroundColor == 'red'){
                this.innerHTML = parseInt(this.innerHTML) -1;
                this.style.backgroundColor = 'green';
            }
            else{
                this.innerHTML = parseInt(this.innerHTML) +1;
                this.style.backgroundColor = 'red';
            }

            if(document.clicks == 10){
                document.getElementById("avgNumber").innerHTML = "Average number: " + (document.sum / 10);
                document.getElementById("startButton").disabled = false; 
            }
        }

        document.getElementById("startButton").addEventListener("click", randomNumber);
    }
);