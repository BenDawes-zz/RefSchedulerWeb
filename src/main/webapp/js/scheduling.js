requirejs(["js/backend"],function() {
    createSchedule = function () {
        backend.get('game/schedule');
    }
    generateDummyData = function () {
        backend.get('game/dummy-data');
    }
});