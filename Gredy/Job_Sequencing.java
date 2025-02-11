package Gredy;

import java.util.ArrayList;
import java.util.Collections;

public class Job_Sequencing {
    static class job {
        int deadline;
        int profit;
        int id;// 0(A),1(B),2(c),3(D)

        public job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
        int jobsInfo[][] = {
                { 4, 20 },
                { 1, 10 },
                { 1, 40 },
                { 1, 30 }
        };
        // job jobs[] = new job[jobsInfo.length];
        ArrayList<job> jobs = new ArrayList<>();
        for (int i = 0; i < jobsInfo.length; i++) {
            // jobs[i] = new job(i, jobsInfo[i][0], jobsInfo[i][1]);
            // jobs[i].deadline = jobsInfo[i][0];
            // jobs[i].profit = jobsInfo[i][1];
            // jobs[i].id = i;
            jobs.add(new job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }
        // labda function
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);// descending order of profit
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }
        // print sq
        System.out.println("max Job Sequence: " + seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }
    }
}
