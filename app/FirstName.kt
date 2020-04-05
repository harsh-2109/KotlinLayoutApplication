val FirstName = first_name.text.toString()
        val LastName = last_name.text.toString()

        val fullName = getString(
            R.string.fullname,
            FirstName, LastName
        );