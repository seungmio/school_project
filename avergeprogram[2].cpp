// 2학년 1반 시험 성적 과목별, 개인별 성적 평균 구하기

#include <iostream> 
#include <iomanip>
using namespace std;

int main()
{
	const int Number_of_students = 10;
	const int Number_of_subjects = 3;

	double scores[Number_of_subjects][Number_of_students] =
	{
		{90, 100, 95, 60, 70, 50, 20, 100, 98, 100},
		{85, 80, 89, 77, 89, 99, 67, 89, 100, 100},
		{70, 50, 80, 37, 93, 47, 40, 99, 79, 85}
	};

	cout << "과목별 평균" << endl;
	for (int i = 0; i < Number_of_subjects; i++)
	{
		double Total_scores = 0;
		for (int j = 0; j < Number_of_students; j++)
		{
			Total_scores += scores[i][j];
		}
		cout << fixed;
		cout.precision(1);
		cout << " " << Total_scores / Number_of_students;

	}

	cout << "\n" << "학생 개인별 평균" << endl;
	for (int i = 0; i < Number_of_students; i++)
	{
		double Personal_scores = 0;
		for (int j = 0; j < Number_of_subjects; j++)
		{
			Personal_scores += scores[j][i];
		}
		cout << fixed;
		cout.precision(1);
		cout << " " << Personal_scores / Number_of_subjects;
		
	}
	return 0;
}