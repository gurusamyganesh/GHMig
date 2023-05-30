def call() {
    echo "Hi there"
    def stage = new stages()
    stage.executeStages()
    echo "Hi stages"
}