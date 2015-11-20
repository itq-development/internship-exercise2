json.array!(@test_goodies) do |test_goody|
  json.extract! test_goody, :id, :fuel_liters, :journey_km
  json.url test_goody_url(test_goody, format: :json)
end
