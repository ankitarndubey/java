/*
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int find_mask (int n)
{
  int mask = 0;
  for (int i = 1; n / i; i *= 10)
    {
      int digit = n / i % 10;
      mask |= 1 << digit;
    }
  return mask;
}

int dp_subarray (int set, int memo_a[1 << 10], const vector < int >&a)
{
  if (set == 0)
    {
      return memo_a[set] = 0;
    }
  if (memo_a[set] != -1)
    return memo_a[set];

  int result = 0;
for (auto num:a)
    {
      int bitmask = find_mask (num);
      if ((set | bitmask) == set)
	result =
	  std::max (dp_subarray (set ^ find_mask (num), memo_a, a) + num,
		    result);
    }
  return memo_a[set] = result;
}

int main ()
{
  int T;
  std::cin >> T;
  while (T-- > 0)
    {
      int n;
      std::cin >> n;
      int arr[n];
      for (int i = 0; i < n; ++i)
	{
	  std::cin >> arr[i];
	}
      int n1 = sizeof (arr) / sizeof (arr[0]);

      vector < int >vector_a (arr, arr + n1);

      int memo_a[1 << 10];
      for (int i = 0; i < 1 << 10; i++)
	memo_a[i] = -1;

      int maxSum = 0;
      for (int i = 0; i < 1 << 10; i++)
	{
	  maxSum = std::max (maxSum, dp_subarray (i, memo_a, vector_a));
	}
      cout << maxSum << std::endl;
    }

  return 0;

}
*/