package tdd;

public class SecondAir {
        private String turnOn;

        private int temp;
        public void switchOn() {
            this.turnOn = "on";
        }


        public SecondAir(int temp){
            this.temp = temp;
        }
        public void setIncreaseTemp() {
            if (temp >= 16 && temp <= 30) {
                temp++;
            }
            if(temp > 30){
                temp = 30;
            }
        }

        public int getTemp(){
            return temp;
        }

        public void setDecreaseTemp(){
            if(temp >= 16 && temp <= 30){
                temp--;
            }
            if(temp < 16){
                temp = 16;
            }
        }

    }
