#!/usr/bin/env groovy

class Pascal {
    // Function to print first
    // n lines of Pascal's Triangle
    def printPascal(int n)
    {

    // Iterate through every line
    // and print entries in it
    for (int line = 0; line < n; line++)
    {
        // Every line has number of
        // integers equal to line number
        for (int i = 0; i <= line; i++)
        print(binomialCoeff
                        (line, i)+" ");

        println();
    }
    }

    // Link for details of this function
    // https://www.geeksforgeeks.org/space-and-time-efficient-binomial-coefficient/
    def binomialCoeff(int n, int k)
    {
        int res = 1;

        if (k > n - k)
        k = n - k;

        for (int i = 0; i < k; ++i)
        {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

    // Driver code
    def main(String[] args)
    {
    int n = 10;
    printPascal(n);
    }
}
new Pascal().main()
