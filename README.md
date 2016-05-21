#HearthStone Secret Tracker
Authors:  Danny Peng & Roy Joo 

A Java application that can narrow down possible enemy secrets whenever an action is performed.  

Will not work for future updates in Hearthstone where additional secrets are released, but the framework is modular and can be updated easily for accomodating additional secrets.

An interactive window(JFrame, specifically) where the user can actively select their own actions after a secret has been played 
by an opponent.  After each selection, the algorithm will eliminate possible secrets from the pool and display the results
on-screen to the user, assuming that the secret has not been triggered already.  The application features class selection and
reset buttons, as well as tracking multiple enemy secrets at the same time.

Written in June/July 2015.
