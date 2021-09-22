package codegladiator;

import java.io.Console;
import java.util.List;

public class FronNet {

	public static void main(String[] args) {/*
		List<List> neighbors = new List<>();
		List inputNeighbors = new List();

		List<List> n = new List<List>();

		int inputCount = 0;
		List numberofNeighbors = new List();

		inputCount = Integer.ParseInt(Console.ReadLine());

		for (int i = 0; i < inputCount; i++)
		{
		numberofNeighbors.Add(Integer.ParseInt(Console.ReadLine()));
		inputNeighbors.Add(Console.ReadLine());
		}

		for (int i = 0; i < inputCount; i++)
		{
		n.Add(new List());

		var p = inputNeighbors[i].Split(‘ ‘);

		for (int j = 0; j < numberofNeighbors[i]; j++)
		{
		n[i].Add(Convert.ToInt32(p[j]));
		}
		}

		for (int i = 0; i < inputCount; i++)
		{
		neighbors.Add(new List());

		if (numberofNeighbors[i] % 2 == 0)
		{
		for (int j = 0; j <= numberofNeighbors[i] / 2 – 1; j++)
		{
		neighbors[i].Add(Calculate(n[i][j], n[i][j + 2]));
		}
		}
		else
		{
		for (int j = 0; j <= numberofNeighbors[i] / 2; j++)
		{
		neighbors[i].Add(Calculate(n[i][j], n[i][j + 2]));
		}
		}

		for (int j = 0; j < numberofNeighbors[i]; j++)
		{
		neighbors[i].Add(Calculate(n[i][j], 0));
		}
		}

		for (int i = 0; i x.Sum).First();

		if (neg.Second != 0)
		Console.Write(neg.Second);
		if (neg.First != 0)
		Console.Write(neg.First);

		Console.WriteLine();
		}

		Console.ReadKey();
		}

		public static Neighbors Calculate(int a, int b)
		{
		var result = new Neighbors();

		result.First = a;
		result.Second = b;
		result.Sum = a + b;

		return result;
		}

		public class Neighbors
		{
		public int First { get; set; }
		public int Second { get; set; }
		public int Sum { get; set; }
		}
*/
	}

}
