# include "DoubleToCharArrayDisclosureVersion1.h"

int main(){
	double DoublePi = 3.141592653589793115997963468544185161590576171875000;
	int i = 0;
	
	for(i=1;i<=1000;i++){
		printf("%s\n",DoubleToCharArray(DoublePi,(52 - i),(52 - i),(52 - i),3,3,0,5,10,1));
	}//i
}//main