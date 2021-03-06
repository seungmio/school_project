// 2학년 1반 시험 성적 평균 구하기

#include <iostream> 
#include <iomanip>
using namespace std;

int main()
{
	const int Number_of_students = 10;
	const int Number_of_subjects = 1;

	double scores[Number_of_subjects][Number_of_students] =
	{
		{90, 100, 95, 60, 70, 50, 20, 100, 98, 100}
	};

	for (int i = 0; i < Number_of_subjects; i++)
	{
		double Total_scores = 0;
		for (int j = 0; j < Number_of_students; j++)
		{
			Total_scores += scores[i][j];
		}
		cout << fixed;
		cout.precision(1);
		cout << Total_scores / Number_of_students << endl;
	}
	return 0;
}