.class public final Lb/c/b/a/a/a/b;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Lcom/google/android/gms/common/api/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$g<",
            "Lb/c/b/a/e/c/b;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Lcom/google/android/gms/common/api/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$a<",
            "Lb/c/b/a/e/c/b;",
            "Lb/c/b/a/a/a/c;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a<",
            "Lb/c/b/a/a/a/c;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lb/c/b/a/a/a/d/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/a$g;-><init>()V

    sput-object v0, Lb/c/b/a/a/a/b;->a:Lcom/google/android/gms/common/api/a$g;

    new-instance v0, Lb/c/b/a/a/a/e;

    invoke-direct {v0}, Lb/c/b/a/a/a/e;-><init>()V

    sput-object v0, Lb/c/b/a/a/a/b;->b:Lcom/google/android/gms/common/api/a$a;

    new-instance v1, Lcom/google/android/gms/common/api/a;

    sget-object v2, Lb/c/b/a/a/a/b;->a:Lcom/google/android/gms/common/api/a$g;

    const-string v3, "Auth.PROXY_API"

    invoke-direct {v1, v3, v0, v2}, Lcom/google/android/gms/common/api/a;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a$a;Lcom/google/android/gms/common/api/a$g;)V

    sput-object v1, Lb/c/b/a/a/a/b;->c:Lcom/google/android/gms/common/api/a;

    new-instance v0, Lb/c/b/a/e/c/e;

    invoke-direct {v0}, Lb/c/b/a/e/c/e;-><init>()V

    sput-object v0, Lb/c/b/a/a/a/b;->d:Lb/c/b/a/a/a/d/a;

    return-void
.end method
