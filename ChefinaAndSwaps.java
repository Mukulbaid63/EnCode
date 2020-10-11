#include <iostream>
#include <vector>
#include <map>
#include <set>
#include <algorithm>
#include <math.h>
#include <limits.h>

using namespace std;



int main(){
    int t;
    cin>>t;
    while(t--){
        int n, s = INT_MAX;
        cin>>n;
        vector<int> a(n), b(n);
        map<int, int> mp, mpA, mpB;
        for(int i=0;i<n;i++) {
            cin>>a[i];
            mp[a[i]]++;
            mpA[a[i]]++;
            s= min(s, a[i]);
        }
        for(int i=0;i<n;i++){
            cin>>b[i];
            mp[b[i]]++;
            s = min(s, b[i]);
            mpB[b[i]]++;
        }
        bool is_possible = true;
        for(auto &it:mp)
        {
            if(it.second%2)
            {
                is_possible = false;
                break;
            }
            it.second /= 2;
        }
        if(!is_possible){
            cout << -1 << endl;
            continue;
        }
        vector<int> atb, bta;
        for(auto it:mp)
        {
            int count = it.second - mpA[it.first];
            for(int i=0;i<count;i++)
            {
                bta.push_back(it.first);
            }
            count = it.second - mpB[it.first];
            for(int i=0;i<count;i++)
            {
                atb.push_back(it.first);
            }
        }

        sort(atb.begin(), atb.end());
        sort(bta.begin(), bta.end(), greater<int>());
        long long ans=0;
        int j=atb.size()-1, i=0;
        while(i<atb.size())
        {
            if(min(atb[i],bta[i])>2*s)
            {
                break;
            }
            ans=ans+min(atb[i],bta[i]);
            i++;
        }
        while(j>=i)
        {
            if(min(atb[j],bta[j])>2*s)
            {
                break;
            }
            ans=ans+min(atb[j], bta[j]);
            j--;
        }
        ans=ans+(j-i+1)*2*s;
        cout << ans << endl;
    }
    return 0;
}
