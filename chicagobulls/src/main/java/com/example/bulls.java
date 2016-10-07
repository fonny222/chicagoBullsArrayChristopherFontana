package com.example;

import java.text.DecimalFormat;
public class bulls {
    public static void main(String[] args){

        String[] playerName = {"Bobby Portis","Cristiano Felicio","Denzel Valentine","Doug McDermott","Dwayne Wade","Isaiah Canaan","Jerian Grant",
                "Jimmy Butler","Nikola Mirotic","Rajon Rondo","Robin Lopez","Spencer Dinwidie","Taj Gibson","Tony Snell"};
        double[] pointsPlayer = {6,4,4,13,6,2,7,13,2,2,8,3,11,10};
        double[] reboundPlayer = {9,0,1,5,2,0,0,3,3,6,3,0,12,4};
        double[] threePercent = {33.3,0,0,0,100,0,100,100,0,0,0,0,0,0};


        int counter = pointsPlayer.length;
        double points = 0;
        final int numberPlayers = 14;
        double avePointPlayer;
        double totalReb;
        double aveReb;

        double tempThree;
        String tempName;
        double tempRebound;
        double derrickPER;
        double jimmyPER;

// this formats the double to 2 decimal players
        DecimalFormat twoDec = new DecimalFormat("#.00");


// Sort the arrays******************************
        for(int i = 0; i < counter - 1; i++){
            for(int j = 0; j < counter -1; j++){
                if(threePercent[j] < threePercent[j+1]){
                    tempThree = threePercent[j];
                    tempName = playerName[j];
                    tempRebound = reboundPlayer[j];
                    threePercent[j] = threePercent[j+1];
                    playerName[j] = playerName[j+1];
                    reboundPlayer[j] = reboundPlayer[j+1];
                    threePercent[j+1] = tempThree;
                    playerName[j+1] = tempName;
                    reboundPlayer[j+1] = tempRebound;
                }
            }
        }




//points per player****************************

        for(int i = 0; i < counter; i++){

            points = points + pointsPlayer[i];
        }

        avePointPlayer = points/numberPlayers;

        System.out.println();
        System.out.println("The Bulls Scored: "+points+" In 1 game.");
        System.out.println("The Bulls average "+twoDec.format(avePointPlayer)+" Points per player in that game." );


//Top 3 three point shooters**************************
        // rebound percentage
        totalReb = reboundPlayer[0] + reboundPlayer[1] + reboundPlayer[2];
        aveReb = totalReb/3;

        System.out.println();
        System.out.println("The top three 3-Point shooters were: ");
        System.out.println(playerName[0]+" Percentage: "+threePercent[0]+"%");
        System.out.println(playerName[1]+" Percentage: "+threePercent[1]+"%");
        System.out.println(playerName[2]+" Percentage: "+threePercent[2]+"%");

        System.out.println();
        System.out.println("They averaged "+twoDec.format(aveReb)+" Rebounds each");
        System.out.println();

//Derrick Rose vs Jimmy Butler *******************
// simple PER or Player efficiency rating is
// (2ptFGMade*2)-(2ptFGAttempted*.75)+(3ptFGMade*3)-(3ptFGAttempted*.84)+
// (FT Made)-(FT Attempted*-.65)+rebounds + assists+Blocks+Steals - turnovers


        derrickPER = (7*2)-(13*.75)+(0*3)-(1*.84)+(2)-(3*(-.65))+2+5+1+0-2;
        jimmyPER = (1*2)-(4*.75)+(1*3)-(1*.84)+(8)-(9*(-.65))+3+1+1+1-0;

        System.out.println();
        System.out.println("Using a stat called Simple Player Efficiency Rating");
        System.out.println("I was able to figure out ratings for Derrick Rose and Jimmy Butler");
        System.out.println();
        System.out.println("Derrick Rose "+derrickPER+" PER");
        System.out.println("Jimmy Butler "+jimmyPER+" PER");

        System.out.println("Using Simple PER I was able to determine Jimmy Butler is the better player");
        System.out.println("Based solely on single game efficiency.");


    }
}

