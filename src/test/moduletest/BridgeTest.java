package test.moduletest;

import com.team.olympics.game.gender.Gender;
import com.team.olympics.game.gender.Men;
import com.team.olympics.game.gender.Women;
import com.team.olympics.game.pingpong.PingPong;
import com.team.olympics.game.pingpong.PingPongDual;
import com.team.olympics.game.pingpong.PingPongSingle;
import com.team.olympics.game.pingpong.PingPongTeam;

import java.util.Scanner;

public class BridgeTest {
    public static void bridgeTest()
    {
        Gender gender=null;
        PingPong pingPongGame = null;
        boolean testing = true;
        boolean validGender = false;
        boolean validType = false;
        Scanner sc = new Scanner(System.in);
        while(testing)
        {
            System.out.println("Please choose the gender of the ping-pong game you want to watch[1:Men, 2:Women,0:Quit]:");
            int genderType = sc.nextInt();
            if(genderType == 0)
            {
                testing = false;
            }
            else
            {
                while(!validGender)
                {
                    switch(genderType)
                    {
                        case 1:
                        {
                            gender = new Men();
                            validGender = true;
                            break;
                        }
                        case 2:
                        {
                            gender = new Women();
                            validGender = true;
                            break;
                        }
                        default:
                        {
                            System.out.println("Invalid gender type! Please choose again!");
                            genderType = sc.nextInt();
                        }
                    }
                }
                System.out.println("Please choose the type of the ping-pong game you want to watch[1:Single, 2:Dual, 3:Team, 0:Quit]:");
                int type = sc.nextInt();
                if(type == 0)
                {
                    testing = false;

                }
                else
                {
                    while(!validType)
                    {
                        switch (type)
                        {
                            case 1:
                            {
                                pingPongGame = new PingPongSingle(gender);
                                validType = true;
                                break;
                            }
                            case 2:
                            {
                                pingPongGame = new PingPongDual(gender);
                                validType = true;
                                break;
                            }
                            case 3:
                            {
                                pingPongGame = new PingPongTeam(gender);
                                validType = true;
                                break;
                            }
                            default:
                            {
                                System.out.println("Invalid game type! Please choose again!");
                                genderType = sc.nextInt();
                            }
                        }
                    }
                    pingPongGame.show();
                }


            }
        }
        System.out.println("-------- End of Bridge Pattern testing ---------");
    }
    public static void main(String[] args)
    {
        System.out.println("-------------------- Bridge ------------------");
        System.out.println("PingPong(): Create a abstract ping-pong game with certain gender");
        System.out.println("PingPongSingle(): Create a single ping-pong game with certain gender");
        System.out.println("PingPongDual(): Create a dual ping-pong game with certain gender");
        System.out.println("PingPongTeam(): Create a team ping-pong game with certain gender");
        System.out.println();
        bridgeTest();

    }
}