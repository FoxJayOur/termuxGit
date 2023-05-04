def small_tournament(number_of_participants, N):
    half = number_of_participants / 2
    tshirt_winners = half
    laptop_winners = tshirt_winners / N
    losers = number_of_participants - (tshirt_winners + laptop_winners)
    
    while True:
      if laptop_winners == tshirt_winners / N and (tshirt_winners + laptop_winners + 
      losers == number_of_participants) and (losers > half):
        return (laptop_winners, tshirt_winners, losers)
        
      else:
        tshirt_winners = tshirt_winners - 2
        laptop_winners = tshirt_winners / N
        losers = number_of_participants - (tshirt_winners + laptop_winners)
        
        
        
small_tournament(100, 2)