#include "stdio.h"
#include "stdlib.h"

/* leetcode 868
 * Given a positive integer N, find and return the longest distance between
 * two consecutive 1's in the binary representation of N.
 * 
 * If there aren't two consecutive 1's, return 0.
 * Example:

 */
int binary_gap(int num);

void main(int argc, char **argv)
{
	int num = 0;
	if (argc != 2) {
		printf("Usage: %s number\n", argv[0]);
		return;
	}
		
	num = atoi(argv[1]);
	printf("num=%d, bin=%x\n", num, num);
	printf("Max gap is %d\n", binary_gap(num));
	return;
}

int binary_gap(int num) 
{
	int gap = 0, max_gap = 0, first_found = 0;
	for(;num > 0; num = num >> 1) {
		if (num & 0x01) {
			if (!first_found) first_found = 1;
			else {
				gap++;
				max_gap = (gap > max_gap) ? gap : max_gap;  // find another 1, cal gap 
				gap = 0;
			}
		}
		else if (first_found)
			gap++;
	}
	return max_gap;
}

/*
int binary_gap(int num) 
{
	int onebit;
	int gap = 0;
	int max_gap = 0;
	int first_found = 0;
	while(num > 0) {
		onebit = num & 0x01;
		if (onebit == 1) {
			if (first_found == 0){
				first_found = 1; // find first 1
			}
			else {
				gap++;
				max_gap = (gap > max_gap) ? gap : max_gap;  // find another 1, cal gap 
				gap = 0;
			}
		}
		else {
			if (first_found == 1) {
				gap++;
			}

		}
		num = num >> 1;
	}

	return max_gap;
}

*/
