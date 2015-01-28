/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.Bug;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class TriangleBug extends Bug
{
    private int baseSteps;
    private boolean sideSteps1;
    private boolean sideSteps2;
    private int baseLength;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public TriangleBug(int length)
    {
        baseSteps = 0;
        sideSteps1 = true;
        sideSteps2 = true;
        baseLength = length;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (baseSteps < baseLength && canMove())
        {
            move();
            baseSteps++;
        }
        else if (sideSteps1) 
        {
        	turn();
        	turn();
        	turn();
        	baseSteps = baseLength / 2;
        	sideSteps1 = false;
           
        } else if (sideSteps2)
        {
        	turn();
        	turn();
        	baseSteps = baseLength / 2;
        	sideSteps2 = false;
        } else 
        {
        	turn();
        	turn();
        	turn();;
        	baseSteps = 0;
        	sideSteps1 = true;
        	sideSteps2 = true;
        }
        	
    }
}
