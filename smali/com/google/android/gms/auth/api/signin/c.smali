.class public Lcom/google/android/gms/auth/api/signin/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/common/api/k;


# instance fields
.field private b:Lcom/google/android/gms/common/api/Status;

.field private c:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/signin/c;->b:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/signin/c;->c:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    return-object v0
.end method
