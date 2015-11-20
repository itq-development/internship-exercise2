class AddConsumptionToTestGoodies < ActiveRecord::Migration
  def change
    add_column :test_goodies, :consumption, :string
  end
end
