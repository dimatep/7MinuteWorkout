package learning.self.kotlin.a7minuteworkout

class Exercises {

    companion object{
        fun defaultExerciseList():ArrayList<ExerciseModel>{
            var exercisesList = ArrayList<ExerciseModel>()

            val jumpingJacks = ExerciseModel(1,
                "Jumping Jacks",
                R.drawable.jumping_jacks,
                false,
                false)
            exercisesList.add(jumpingJacks)

            val wallSit = ExerciseModel(2,
                "Wall Sit",
                R.drawable.wall_sit,
                false,
                false)
            exercisesList.add(wallSit)

            val pushUp = ExerciseModel(3,
                "Push Ups",
                R.drawable.pushups,
                false,
                false)
            exercisesList.add(pushUp)

            val abCrunch = ExerciseModel(4,
                "Abdominal Crunch",
                R.drawable.ab_crunch,
                false,
                false)
            exercisesList.add(abCrunch)

            val stepUp = ExerciseModel(5,
                "Step-Up Onto Chair",
                R.drawable.stepup,
                false,
                false)
            exercisesList.add(stepUp)

            val squat = ExerciseModel(6,
                "Squat",
                R.drawable.squat,
                false,
                false)
            exercisesList.add(squat)

            val tricepsDip = ExerciseModel(7,
                "Triceps Dip On Chair",
                R.drawable.triceps_dip,
                false,
                false)
            exercisesList.add(tricepsDip)

            val plank = ExerciseModel(8,
                "Plank",
                R.drawable.plank,
                false,
                false)
            exercisesList.add(plank)

            val highKnees = ExerciseModel(9,
                "High Knees Running In Place",
                R.drawable.high_knees,
                false,
                false)
            exercisesList.add(highKnees)

            val lunge = ExerciseModel(10,
                "Lunges",
                R.drawable.lunge,
                false,
                false)
            exercisesList.add(lunge)

            val pushUpAndRotation = ExerciseModel(11,
                "Push ups And Rotation",
                R.drawable.pushup_and_rotation,
                false,
                false)
            exercisesList.add(pushUpAndRotation)

            val sidePlank = ExerciseModel(12,
                "Side Plank",
                R.drawable.side_plank,
                false,
                false)
            exercisesList.add(sidePlank)

            return exercisesList
        }
    }
}