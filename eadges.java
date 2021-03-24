package com.mycompany.graph_drawing;
import java.util.Scanner;
 public class eadges extends graph 
{
    private int weight ,eadges_num, firstnode, secondnode;
//    public static boolean checkofnode[]=new boolean [1000];
//    public static boolean checkofdeletednode[]=new boolean [1000];
// ------------------    this is constructor
    public eadges(int node_num, int eadges_num)
    {
        super(node_num, eadges_num);
        this.eadges_num = eadges_num;
        for(int i=0;i<nodenumber;i++)
        {
            checkofnode[i]=false;
        }
        for(int i=0;i<nodenumber;i++)
        {
            checkofdeletednode[i]=false;
        }
    }


    
// --------------------  to take input of all edges
    
    public void input(int eadges_num)
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < eadges_num; i++)
        {
            System.out.println("enter the first node, second node and weight ");
            firstnode = input.nextInt();
            secondnode = input.nextInt();
            checkofnode[firstnode-1]=true;
            checkofnode[secondnode-1]=true;
            weight = input.nextInt();
            adj_graph[firstnode - 1][secondnode - 1] = weight;
        }
    }
// ------------------------------ Add Edge ------------------------------------------------
    public void add_edge() 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first node, second node and weight ");
        firstnode = input.nextInt();
        secondnode = input.nextInt();
        weight = input.nextInt();
        if (checkofnode[firstnode - 1] == true && checkofnode[secondnode - 1] == true)
        {
            adj_graph[firstnode - 1][secondnode - 1] = weight;
        }
        else
        {
            System.out.println("Those nodes aren't created or deleted!!");
        }
    }
    // ------------------------------ Delete_Edge ---------------------------------------------------------
    
    public void Delete_Edge()
    {
        ///// alert  return to this function handling if the edge if is already created (tomorrow);
        System.out.println("enter the first node, second node ");
        Scanner input = new Scanner(System.in);
        firstnode=input.nextInt();
        secondnode = input.nextInt();
        firstnode--;
        secondnode--;
        adj_graph [firstnode][secondnode]=-1;
    }
// ----------------------- showChildren --------------------------
    
public void displayChildren()
{
     ///// alert  return to this function handling if the edge if is already created (tomorrow);
    Scanner input = new Scanner(System.in);
    System.out.println("Enter node value to show its childrens.");
    int node = input.nextInt();
    if (checkofnode[node - 1] == true && checkofdeletednode[node - 1] == false)
    {
        for (int i = 0; i < nodenumber; i++)
        {
            if (adj_graph[node - 1][i] > 0)
            {
                System.out.println((i + 1) + " ");
            }
//     else if (adj_graph[node - 1][i] == 0)
//    {
//        System.out.println("This node isn't created or deleted!!");
//        break;
//    }
        }
    }
    else
    {
        System.out.println("This node isn't created or deleted!!");
    }
}

//    @Override
//    public void add_node() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void popnode() 
//    {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}