public class Main {



    public static double DPSBody(double reloadTime, double magSize, double roundsPerMinute, double damagePerRound){
        return magSize*damagePerRound/(reloadTime+(magSize/(roundsPerMinute/60)));
    }

    public static void main(String[] args) {
        double headMultiplier=2;
        double dps = DPSBody(3.2,18,720,14 );
        System.out.println(dps);
        System.out.println(headMultiplier*dps);


    }
}


/*
hM 1.5
Alternator 2.23,16,640,13
R-99 2.45,12,1080,12
Prowler 2.6,20,800,14
Peacekeeper 3.5,6,58,110
EVA-8 3.5,8,128,63
Mozambique 2.6,3,180,45
RE45 2.12,15,750,11
P2020 1.25,10,430,12

hM 2.0
R-301 3.2,18,720,14
Flatline 3.1,20,600,16
Hemlok 2.8,18,490,18
Sptifire 3.33,35,512,20
Scout 3,10,273,20
Devotion 3.63,44,900,17
Longbow 3.66,5,86,55
Triple Take 3.6,5,88,69
Kraber 4.3,4,36,125
Mastiff 1.7,4,96,144
Wingman 2.1,6,205,45
 */