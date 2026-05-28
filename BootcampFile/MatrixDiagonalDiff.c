#include<stdio.h>
#include<math.h>
int main(){
    int n;
    printf("Enter the number of elements: ");
    scanf("%d",&n);
    int mat[n][n];
    int i,j;
    printf("Enter the elements: ");
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
           scanf("%d",&mat[i][j]);
        }
    }
    int sum1=0, sum2=0;
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(i==j){
                sum1=sum1+mat[i][j];
            }
        }
    }
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(i+j==n-1){
                sum2=sum2+mat[i][j];
            }
        }
    }
    int diff=abs(sum1-sum2);
    printf("%d ",diff);
    return 0;
}
