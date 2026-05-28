#include<stdio.h>
void SumRow(int r,int c,int mat[r][c]){
    int maxSum=0;
    int rowIndex=-1;
    for(int i=0;i<r;i++){
        int sum=0;
        for(int j=0;j<c;j++){
            sum+=mat[i][j];
        }
        if(sum>maxSum){
            maxSum=sum;
            rowIndex=i;
        }
    }
    printf("Row Index with maximum sum is: %d\n", rowIndex);
    printf("Matrix after deleting the row with maximum sum:\n");
    for(int i=0;i<r;i++){
         if(i!=rowIndex){
            for(int j=0;j<c;j++){
                printf("%d ",mat[i][j]);
            }
            printf("\n");
        }
    }
}
int main(){
    int r,c;
    printf("Enter the number of rows and columns: ");
    scanf("%d %d",&r,&c);
    int mat[r][c];
    printf("Enter the elements of the matrix: ");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
             scanf("%d",&mat[i][j]);
        }
    }
    SumRow(r,c,mat);
    return 0;
}