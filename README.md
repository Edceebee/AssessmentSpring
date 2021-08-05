# Distance Calculator

---
---
###Description

---
>This Endpoint `/solution/` can be used to calculate the distance between two
>coordinates/location of two different users.
>
> ### Mathematically,
>_**distance = 2 ⋅ R ⋅ arcsin√(sin²(Δφ/2) + cos φ1 ⋅ cos φ2 ⋅ sin²(Δλ/2))**_
>- where φ is latitude, λ is longitude,
>- R is earth’s radius (mean radius = 6,371km);
>- Δ is delta. i.e the difference between 2 values.
   > Note that angles need to be in radians to pass trig functions in the formula. PI = 3.142
####Parameters required for endpoint:
+ longitude1
+ Latitude1
+ Longitude2
+ Latitude2
> ##response example
> #### Request: curl -X GET “http://solution/?latitude1=55&longitude1=42&latitude2=33&longitude2=89”
>#### expected response: “4366.44 km”
>Format: response is rounded up to 2 decimal places


####