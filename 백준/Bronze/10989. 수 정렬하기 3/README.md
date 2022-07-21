# [Bronze I] 수 정렬하기 3 - 10989 

[문제 링크](https://www.acmicpc.net/problem/10989) 

### 성능 요약

메모리: 300996 KB, 시간: 1848 ms

### 분류

정렬(sorting)

--- 
## 배운 점
![image](https://user-images.githubusercontent.com/100677209/180139842-928d0357-0e10-40e4-b2d3-692b3c3656e6.png)

        int max=0;
        int[] data=new int[n];
        for (int i = 0; i < n; i++) {
            data[i]=Integer.parseInt(br.readLine());
            if(max<data[i]) max=data[i];
        }

        int[] counting=new int[max+1];
        for(int i=0;i<counting.length;i++){
            counting[i]=0;
        }

        for (int i = 0; i < data.length; i++) {
            counting[data[i]]++;
        }

        int j=0;
        for(int i=0;i< counting.length;i++){
            while(counting[i]>0){
                data[j]=i;
                counting[i]--;
                j++;
            }
        }

        for(int i=0;i<data.length;i++){
            bw.write(data[i]+" ");
        }
