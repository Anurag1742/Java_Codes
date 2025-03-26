public class HighestAltitude {
    
    public static int maxDistance( int [] gain){
        int MaxAltitude = 0;
        int altitude = 0;
        for(int i = 0; i< gain.length;i++){
            altitude = altitude + gain[i];
            if(altitude>MaxAltitude)
            MaxAltitude = altitude;
        }
        return MaxAltitude;
    }
    public static void main(String[] args) {
        int gain[] = {-5 ,1 ,5 ,0 ,-7 };
        System.out.println("Highest Altitude : " + maxDistance(gain));
        }
    }
