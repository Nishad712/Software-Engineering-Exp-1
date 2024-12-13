#include <stdio.h>
#include <math.h>
int main() {
    double a = -0.5, b = 8, c = 15; 
    double discriminant, root1, root2;
    discriminant = b * b - 4 * a * c;
    if (discriminant < 0) {
        printf("No real solutions for the temperature curve.\n");
    } else {
        root1 = (-b + sqrt(discriminant)) / (2 * a);
        root2 = (-b - sqrt(discriminant)) / (2 * a);
        printf("Roots: x1 = %.2f, x2 = %.2f\n", root1, root2);
    }
    return 0;
}

