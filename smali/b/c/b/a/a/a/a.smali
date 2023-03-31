.class public final Lb/c/b/a/a/a/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/c/b/a/a/a/a$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/google/android/gms/common/api/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$g<",
            "Lb/c/b/a/e/b/g;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lcom/google/android/gms/common/api/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$g<",
            "Lcom/google/android/gms/auth/api/signin/internal/j;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Lcom/google/android/gms/common/api/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$a<",
            "Lb/c/b/a/e/b/g;",
            "Lb/c/b/a/a/a/a$a;",
            ">;"
        }
    .end annotation
.end field

.field private static final d:Lcom/google/android/gms/common/api/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$a<",
            "Lcom/google/android/gms/auth/api/signin/internal/j;",
            "Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a<",
            "Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/a$g;-><init>()V

    sput-object v0, Lb/c/b/a/a/a/a;->a:Lcom/google/android/gms/common/api/a$g;

    new-instance v0, Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/a$g;-><init>()V

    sput-object v0, Lb/c/b/a/a/a/a;->b:Lcom/google/android/gms/common/api/a$g;

    new-instance v0, Lb/c/b/a/a/a/f;

    invoke-direct {v0}, Lb/c/b/a/a/a/f;-><init>()V

    sput-object v0, Lb/c/b/a/a/a/a;->c:Lcom/google/android/gms/common/api/a$a;

    new-instance v0, Lb/c/b/a/a/a/g;

    invoke-direct {v0}, Lb/c/b/a/a/a/g;-><init>()V

    sput-object v0, Lb/c/b/a/a/a/a;->d:Lcom/google/android/gms/common/api/a$a;

    sget-object v0, Lb/c/b/a/a/a/b;->c:Lcom/google/android/gms/common/api/a;

    new-instance v0, Lcom/google/android/gms/common/api/a;

    sget-object v1, Lb/c/b/a/a/a/a;->c:Lcom/google/android/gms/common/api/a$a;

    sget-object v2, Lb/c/b/a/a/a/a;->a:Lcom/google/android/gms/common/api/a$g;

    const-string v3, "Auth.CREDENTIALS_API"

    invoke-direct {v0, v3, v1, v2}, Lcom/google/android/gms/common/api/a;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a$a;Lcom/google/android/gms/common/api/a$g;)V

    new-instance v0, Lcom/google/android/gms/common/api/a;

    sget-object v1, Lb/c/b/a/a/a/a;->d:Lcom/google/android/gms/common/api/a$a;

    sget-object v2, Lb/c/b/a/a/a/a;->b:Lcom/google/android/gms/common/api/a$g;

    const-string v3, "Auth.GOOGLE_SIGN_IN_API"

    invoke-direct {v0, v3, v1, v2}, Lcom/google/android/gms/common/api/a;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a$a;Lcom/google/android/gms/common/api/a$g;)V

    sput-object v0, Lb/c/b/a/a/a/a;->e:Lcom/google/android/gms/common/api/a;

    sget-object v0, Lb/c/b/a/a/a/b;->d:Lb/c/b/a/a/a/d/a;

    new-instance v0, Lb/c/b/a/e/b/f;

    invoke-direct {v0}, Lb/c/b/a/e/b/f;-><init>()V

    new-instance v0, Lcom/google/android/gms/auth/api/signin/internal/g;

    invoke-direct {v0}, Lcom/google/android/gms/auth/api/signin/internal/g;-><init>()V

    return-void
.end method
