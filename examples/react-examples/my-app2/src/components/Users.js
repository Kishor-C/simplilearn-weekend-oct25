
function Users() {
    let users = [
        {id: 231, name : "Alex1", phone : 998989},
        {id: 214, name : "Alex2", phone : 498989},
        {id: 333, name : "Alex3", phone : 598989},
        {id: 444, name : "Alex4", phone : 798989}
    ];
    // you must use map to iterate and transform into HTML element
    //items = [<li>..</li>, <li>...</li>]
    // let items = users.map((ele, pos)=>
    //     <li key = {ele.id}>{ele.id}, {ele.name}, {ele.phone}</li>);

    return (<div>
        <h2>Users List</h2>
        <ul>
            {users.map((ele, pos) => <li key = {ele.id}>Hi {ele.name}, your phone {ele.phone}</li>)}
        </ul>
        <h2>Users in a table</h2>
        <table className="table">
            <thead>
                <tr>
                    <th>#</th><th>User Id</th><th>Name</th><th>Phone</th>
                </tr>
            </thead>
            <tbody>
                {users.map((ele, pos)=><tr key={ele.id}>
                    <td>{pos + 1}</td><td>{ele.id}</td><td>{ele.name}</td><td>{ele.phone}</td>
                </tr>)}
            </tbody>
        </table>
    </div>)
}
export default Users;