#include <iostream> 
using namespace std;

int cnt = 0; // �̵� Ƚ���� �̿�.

void Hanoi(int n, char from, char temp, char to)
// n : ���ݰ���, from : ���� ��ġ, temp : �ӽ� ���, to :������
{

	// ���α׷��� �ϼ��ϼ���
	if (n == 1) {	//������ 1���� �ű�� ���,
		printf("���� %d�� ��� %c���� ��� %c���� �ű��.\n", n, from, to);	//from���� to�� �ű��.
		return;
	}
	else {
		Hanoi(n - 1, from, to, temp);	//(n-1)�� ������ from���� temp�� �ű��.
		printf("���� %d�� ��� %c���� ��� %c���� �ű��.\n", n, from, to); //���� ū ������ from���� to�� �ű��.
		Hanoi(n - 1, temp, from, to);	//(n-1)�� ������ temp���� to�� �ű��.

	}

}


void main()
{
	int n; //������ ��

	cout << "������ ������ �Է��ϼ��� : ";
	cin >> n;

	Hanoi(n, 'A', 'B', 'C');    // n���� ������ 'A'���� 'C'�� �̵�
	cnt = pow(2, n) - 1;	//������ �̵��� Ƚ��
	cout << "��ü ���� �̵� ��(���ݼ� : " << n << ") = " << cnt << endl;
}