        public class Calculator {
        
                // addition function
                static double additions(double... numbers) {
                    double sum =0;
                    int i =0;
                    while (i<numbers.length){
        
                        sum += numbers[i];
                        i++;
                    }
                    return sum;
                }
        
                // multiplication function
                static  double multiplication(double... a) {
                    double product =1;
                    int i =0;
                    while (i< a.length){
        
                        product *=a[i];
                        i++;
                    }
                    return (product);
                }
                
            }
