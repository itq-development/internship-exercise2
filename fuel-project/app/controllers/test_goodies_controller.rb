class TestGoodiesController < ApplicationController
  before_action :set_test_goody, only: [:show, :edit, :update, :destroy]

  # GET /test_goodies
  # GET /test_goodies.json
  def index
    @test_goodies = TestGoody.all
  end

  # GET /test_goodies/1
  # GET /test_goodies/1.json
  def show
  end

  # GET /test_goodies/new
  def new
    @test_goody = TestGoody.new
  end

  # GET /test_goodies/1/edit
  def edit
  end

  # POST /test_goodies
  # POST /test_goodies.json
  def create
    @test_goody = TestGoody.new(test_goody_params)
    consumption = test_goody_params[:fuel_liters].to_f / test_goody_params[:journey_km].to_f * 100
    @test_goody.consumption = consumption

    respond_to do |format|
      if @test_goody.save
        format.html { redirect_to @test_goody, notice: 'Test goody was successfully created.' }
        format.json { render :show, status: :created, location: @test_goody }
      else
        format.html { render :new }
        format.json { render json: @test_goody.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /test_goodies/1
  # PATCH/PUT /test_goodies/1.json
  def update
    respond_to do |format|
      if @test_goody.update(test_goody_params)
        format.html { redirect_to @test_goody, notice: 'Test goody was successfully updated.' }
        format.json { render :show, status: :ok, location: @test_goody }
      else
        format.html { render :edit }
        format.json { render json: @test_goody.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /test_goodies/1
  # DELETE /test_goodies/1.json
  def destroy
    @test_goody.destroy
    respond_to do |format|
      format.html { redirect_to test_goodies_url, notice: 'Test goody was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_test_goody
      @test_goody = TestGoody.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def test_goody_params
      params.require(:test_goody).permit(:fuel_liters, :journey_km)
    end
end
