package exercicio_6_2;

public class QuickSort implements SortMethod {

	@Override
	public int[] sort(int[] v) {
		quickSort(v, 0, v.length - 1);
		return v;
	}

	public void quickSort(int v[], int p, int r) {
		int j;
		if (p < r) {
			j = separate(v, p, r);
			quickSort(v, p, j - 1);
			quickSort(v, j + 1, r);
		}
	}

	private int separate(int v[], int p, int r) {
		int c = v[p + ((int) (Math.random() * (1 + r - p) * 1000) % (1 + r - p))];
		int i = p + 1, j = r, t;
		while (true) {
			while (i <= r && v[i] <= c)
				++i;
			while (c < v[j])
				--j;
			if (i >= j)
				break;
			t = v[i];
			v[i] = v[j];
			v[j] = t;
			++i;
			--j;
		}
		v[p] = v[j];
		v[j] = c;
		return j;
	}

}
