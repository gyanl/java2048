/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048;

import java.util.Random;

/**
 *
 * @author user
 */
public class Griddy {
    int g[][] = new int[4][4];
    //initialise with a random 2.
    
    void testfill()
    {
        display();
        int i=0,j=0,n=2;
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                g[i][j]=n;
                g[i][0]=0;
            }
        }
    } 
    
        void addrandom2()
    {
        int zero[][] = new int[2][16];
        int i=0,j=0,n=0,p=0;
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                if (g[i][j]==0);
                {
                zero[0][n]=i;
                zero[1][n]=j;
                }
            }
        }
        Random rand = new Random();
        p=rand.nextInt(n);
        g[(zero[0][p])][(zero[1][p])]=2;
    } 
    
    void display()
    {
        int i=0,j=0;
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(g[i][j] + "  ");
        
            }
        System.out.println(" ");
        }
    System.out.println(" ");
    }
    
    
    void pushright()
    {
        int h,i,j;
        for(h=0;h<2;h++)
        {
            for(i=0;i<4;i++)
            {
                for(j=2;j>=0;j--)
                {
                    if (g[i][j+1]==0) 
                    {
                        g[i][j+1]=g[i][j];
                        g[i][j]=0;
                    }
                    else if (g[i][j+1]==g[i][j])
                    {
                        g[i][j+1]=2*(g[i][j]);
                        g[i][j]=0;
                    }
                }
            }
        }
    }
    
    void pushleft()
    {
        int h,i,j;
        for(h=0;h<2;h++)
        {
            for(i=0;i<4;i++)
            {
                for(j=0;j<3;j++)
                {
                    if (g[i][j]==0) 
                    {
                        g[i][j]=g[i][j+1];
                        g[i][j+1]=0;
                    }
                    else if (g[i][j]==g[i][j+1])
                    {
                        g[i][j]=2*(g[i][j+1]);
                        g[i][j+1]=0;
                    }
                }
            }
        }
    }
    
    void pushup()
    {
        int h,i,j;
        for(h=0;h<2;h++)
        {
            for(j=0;j<4;j++)
            {
                for(i=0;i<3;i++)
                {
                    if (g[i][j]==0) 
                    {
                        g[i][j]=g[i+1][j];
                        g[i+1][j]=0;
                    }
                    else if (g[i][j]==g[i+1][j])
                    {
                        g[i][j]=2*(g[i+1][j]);
                        g[i+1][j]=0;
                    }
                }
            }
        }
    }
    
    void pushdown()
    {
        int h,i,j;
        for(h=0;h<2;h++)
        {
            for(j=0;j<4;j++)
            {
                for(i=2;i>=0;i--)
                {
                    if (g[i+1][j]==0) 
                    {
                        g[i+1][j]=g[i][j];
                        g[i][j]=0;
                    }
                    else if (g[i+1][j]==g[i][j])
                    {
                        g[i+1][j]=2*(g[i][j]);
                        g[i][j]=0;
                    }
                }
            }
        }
    }
}
