import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class ShortestPathInDAG {
    public static void main(String[] args) {
        int n=6;
        int m=7;
        int [][]list={
                {0,1,2},
                {0,4,1},
                {4,5,4},
                {4,2,2},
                {1,2,3},
                {2,3,6},
                {5,3,1}
        };
       int src=0;
        ArrayList<ArrayList<Pair>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<list.length;i++){
            adj.get(list[i][0]).add(new Pair((list[i][1]), (list[i][2])));
        }
        int[]vis=new int[n];
        for(int i=0;i<n;i++){
            vis[i]=0;
        }
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                dfs(i,vis,adj,st);
            }
        }
        int dist[]=new int[n];
        int parent[]=new int[n];
        for(int i=0;i<dist.length;i++){
            dist[i]=(int)1e9;
            parent[i]=-1;
        }
        dist[src]=0;
        while(!st.isEmpty()){
            int node=st.peek();
            st.pop();

            for(int i=0;i<adj.get(node).size();i++){
                int v=adj.get(node).get(i).first;
                int wt=adj.get(node).get(i).second;

                if(dist[node]+wt<dist[v]){
                    dist[v]=dist[node]+wt;
                    parent[v]=node;
                }


            }

        }

        for(int i=0;i<dist.length;i++){
            System.out.println(dist[i]);
        };

        System.out.println();
        System.out.println();
        for(int i=0;i<dist.length;i++){
            System.out.println(parent[i]);
        };
        ArrayList<Integer>path=new ArrayList<>();
        int node=5;
        parent[0]=0;
        while(parent[node]!=node){
            path.add(node);
            node=parent[node];
        }
        System.out.println();
        System.out.println();
        path.add(1);
        Collections.reverse(path);
        for(int i=0;i<path.size();i++){
            System.out.println(path.get(i));
        }



    }

    public static void dfs(int node,int[]vis,ArrayList<ArrayList<Pair>>adj,Stack<Integer>st){
        vis[node]=1;

        for(int it=0;it<adj.get(node).size();it++){
            int v=adj.get(node).get(it).first;
            if(vis[v]==0){
                dfs(v,vis,adj,st);
            }
        }
        st.push(node);


    }

}
