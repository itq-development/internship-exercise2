require 'test_helper'

class TestGoodiesControllerTest < ActionController::TestCase
  setup do
    @test_goody = test_goodies(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:test_goodies)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create test_goody" do
    assert_difference('TestGoody.count') do
      post :create, test_goody: { fuel_liters: @test_goody.fuel_liters, journey_km: @test_goody.journey_km }
    end

    assert_redirected_to test_goody_path(assigns(:test_goody))
  end

  test "should show test_goody" do
    get :show, id: @test_goody
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @test_goody
    assert_response :success
  end

  test "should update test_goody" do
    patch :update, id: @test_goody, test_goody: { fuel_liters: @test_goody.fuel_liters, journey_km: @test_goody.journey_km }
    assert_redirected_to test_goody_path(assigns(:test_goody))
  end

  test "should destroy test_goody" do
    assert_difference('TestGoody.count', -1) do
      delete :destroy, id: @test_goody
    end

    assert_redirected_to test_goodies_path
  end
end
