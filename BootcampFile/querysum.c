#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int arr[n];
    int prefix[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    prefix[0] = 0;
    int l,r;
    scanf("%d",&l);
    scanf("%d",&r);
    for(int i=1;i<=n;i++){
        prefix[i]=prefix[i-1]+arr[i-1];
    }
    int sum=prefix[r]-prefix[l-1];
    printf("%d",sum);
    return 0;
}