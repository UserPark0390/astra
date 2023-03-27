package Sliver;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BackJoon11286_절대값힙2{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        // priorityqueue는 기본적으로 오름차순 정렬
        // Comparator -> interface (util package에 있다.)
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>(){
            @Override		// 
            public int compare(Integer a, Integer b){
                int A = Math.abs(a);
                int B = Math.abs(b);
                
                if(A>B)
                    return A-B;
                // 절대값이 같으면 음수를 먼저 제거 -> 앞으로 보내준다
                else if(A == B){
                    if(a>b) return 1;
                    else return -1;
                }

                else
                    return -1;
            }
        });

        int N = Integer.parseInt(br.readLine());

        while(N-->0){
            int num = Integer.parseInt(br.readLine());

            if(num != 0){
                pq.offer(num);
            }
            else{
                if(!pq.isEmpty())
                    sb.append(pq.poll()).append("\n");
                else
                    sb.append("0\n");
            }
        }

        System.out.print(sb);
    }
}