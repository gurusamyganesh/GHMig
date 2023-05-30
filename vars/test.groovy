def call(body) {

    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    echo "Hi there"
    def stage = new stages()
    stage.executeStages()
    echo "Hi stages"
}