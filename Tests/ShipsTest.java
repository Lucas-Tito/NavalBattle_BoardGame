package Tests;

import org.junit.Test;

import Player.Ships;

import static org.junit.Assert.assertEquals;

public class ShipsTest {

    @Test
    public void constructorTest() {
        Ships ship = new Ships();

    }

    @Test
    public void hitWasTakenTest(){
        Ships ship = new Ships();

        ship.navios = new int[3][2];

        ship.navios[0][0]=1;
        ship.navios[0][1]=2;

        ship.navios[1][0]=1;
        ship.navios[1][1]=2;

        ship.navios[2][0]=1;
        ship.navios[2][1]=2;


        assertEquals(true,ship.hitWasTaken(new int[]{1,2}));

    }

    @Test
    public void hitWasTakenTest2(){
        Ships ship = new Ships();

        ship.navios = new int[3][2];

        ship.navios[0][0]=2;
        ship.navios[0][1]=2;

        ship.navios[1][0]=2;
        ship.navios[1][1]=2;

        ship.navios[2][0]=2;
        ship.navios[2][1]=2;


        assertEquals(false,ship.hitWasTaken(new int[]{1,2}));

    }

}
