class CreateTestGoodies < ActiveRecord::Migration
  def change
    create_table :test_goodies do |t|
      t.integer :fuel_liters
      t.integer :journey_km

      t.timestamps null: false
    end
  end
end
